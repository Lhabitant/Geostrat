
package fr.iutvalence.info.dut.m2107;

import java.io.*;
import javax.sound.sampled.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Audio extends Thread {
	private AudioFormat format;
	private byte[] samples;
	
	public Audio(String filename){
		try{
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("src/music/music_1.wav"));
			format = stream.getFormat();
			samples = getSamples(stream);
		}
		catch (UnsupportedAudioFileException e){
			e.printStackTrace();
	}
	catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public byte[] getSamples(){
		return samples;
	}
	
	public byte[] getSamples(AudioInputStream stream){
		int length = (int)(stream.getFrameLength() * format.getFrameSize());
		byte[] samples = new byte[length];
		DataInputStream in = new DataInputStream(stream);
		try{
			in.readFully(samples);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return samples;
	}
	

	public void play(InputStream source){
		// 100 ms buffer for real time change to the sound stream
		int bufferSize = format.getFrameSize() * Math.round(format.getSampleRate() / 10);
		byte[] buffer = new byte[bufferSize];
		SourceDataLine line;
		try{
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
			line = (SourceDataLine)AudioSystem.getLine(info);
			line.open(format, bufferSize);
		}
		catch (LineUnavailableException e){
			e.printStackTrace();
			return;
		}
		line.start();
		try{
			int numBytesRead = 0;
			while (numBytesRead != -1){
				numBytesRead = source.read(buffer, 0, buffer.length);
				if (numBytesRead != -1)
					line.write(buffer, 0, numBytesRead);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		line.drain();
		line.close();
	}
	
	public static void main(String[] args){
	Audio player = new Audio("src/music/music_1.wav");
		InputStream stream = new ByteArrayInputStream(player.getSamples());
		player.play(stream);
		System.exit(0);
	}
}

