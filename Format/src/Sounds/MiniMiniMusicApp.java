package Sounds;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }//close main

    private void play(){
        try{
            //get a sequencer and open it
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            //args
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            //ask sequence for a track
            Track track = seq.createTrack();

            //put some MidiEvents in
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, 102, 100);
            MidiEvent changeIns = new MidiEvent(first, 1);
            track.add(changeIns);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 20, 100);
            MidiEvent noteOn = new MidiEvent(a , 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 20, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            //give sequence to sequencer
            player.setSequence(seq);
            //start
            player.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }//close play
}//close class
