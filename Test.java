package live;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    Veena obj = new Veena() {
        @Override
        public void play() {
            obj.play();
        }
    };
    Saxophone obj1 = new Saxophone() {
        @Override
        public void play() {
            obj1.play();
        }
    };

}
