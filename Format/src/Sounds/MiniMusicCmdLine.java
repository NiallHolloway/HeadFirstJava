package Sounds;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.sound.midi.*;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if(args.length > 2){
            System.out.println("Dont forget the instrument and note args");
        }else{
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }

    }//close main

    private void play(int instrument, int note){
        try{
            //get a sequencer and open it
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            //args
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            //ask sequence for a track
            Track track = seq.createTrack();

            //put some MidiEvents in
            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 100);
            MidiEvent changeIns = new MidiEvent(first, 1);
            track.add(changeIns);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a , 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
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
