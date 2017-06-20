package arrayslistdemo;
import java.util.ArrayList;
class AABattery {
    @Override
    public String toString() {
        return "AABattery";
    }}
class NineVoltBattery {
    @Override
    public String toString() {
        return "NineVoltBattery";
    } }
class RollOfRibbon {
    @Override
    public String toString() {
        return "RollOfRibbon";
    }}
class PaperClip {
    int i;

    PaperClip(int i) {
        this.i = i;
    }
    @Override
    public String toString() {
        return "PaperClip(" + i + ")";
    }}
class BandAid {

    @Override
    public String toString() {
        return "BandAid";
    } }
class Box {
    ArrayList moreStuff = new ArrayList();
    @Override
    public String toString() {
        String s = new String("Box");
        s += moreStuff;
        return s;
    }}
class BoxOfPaperClips {
    ArrayList clips = new ArrayList();
    @Override
    public String toString() {
        String s = new String("BoxOfPaperClips");
        s += clips;
        return s;
    }}
class JunkDrawer {
    ArrayList contents = new ArrayList();
    public void fillDrawer() {
        contents.add(new RollOfRibbon());
        contents.add(new AABattery());
        contents.add(new NineVoltBattery());
        BoxOfPaperClips boxOfClips = new BoxOfPaperClips();
        for (int i = 0; i < 3; i++) {
            boxOfClips.clips.add(new PaperClip(i));
        }
        contents.add(boxOfClips); //Note we're adding an array reference inside another array
        Box box = new Box();
        box.moreStuff.add(new AABattery());
        box.moreStuff.add(new BandAid());
        contents.add(box);
        contents.add(new AABattery());
    }}
public class ArraysListDemo {
    public static void main(String[] args) {
        JunkDrawer kitchenDrawer = new JunkDrawer();
        kitchenDrawer.fillDrawer();
        System.out.println(kitchenDrawer.contents);
    }}
