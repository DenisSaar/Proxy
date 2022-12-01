package Polimorfizm;

public class MusicStales {
    void playMusic() {
        System.out.println(" Enjoy Music");
    }

    public static void main(String[] args) {
        RockMusic rockMusic = new RockMusic();
        ClassicMusic classicMusic = new ClassicMusic();
        PopMusic popMusic = new PopMusic();
        MusicStales[] musicStyles = new MusicStales[]{rockMusic, popMusic,classicMusic };
        for (MusicStales reproduce : musicStyles) {
            reproduce.playMusic();
        }
    }
}