package fr.iutvalence.info.dut.m2107;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Audio extends Thread {
    private URL url;
    private AudioClip sound;
  
    public Audio()
    {
        url = this.getClass().getClassLoader().getResource("smusic_1.wav");
        sound = Applet.newAudioClip(url);
    }
     
    public void jouer()
    {
        sound.play();
    }
     
    public void jouerEnBoucle()
    {
        sound.loop();
    }
     
    public void arreter()
    { 
        sound.stop();
    }
}
