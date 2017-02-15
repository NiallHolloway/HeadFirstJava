package Sounds;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by niall-holloway on 15/02/17.
 */
public class MusicTest1 {
    private void play(){

        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer ");
        }catch(MidiUnavailableException ex){
            System.out.println("Bummer");
        }
    }//close play

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }//close main
}//close class