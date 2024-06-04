package br.com.music.minhasmusicas;
import br.com.music.modelos.Musica;
import br.com.music.modelos.Podcast;
import br.com.music.modelos.Preferencias;

public class Principal {
    public static void main(String[] args) {
       Musica minhamusica = new Musica();
       minhamusica.setTitulo("90210");
       minhamusica.setCantor("Travis Scott");

        for (int i = 0; i < 1000 ; i++) {
            minhamusica.reproducao();

        }
        for (int i = 0; i <50 ; i++) {
            minhamusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("The Joe Rogan Experience");
        meupodcast.setApresentador("Joe Rogan");

        for (int i = 0; i <5000 ; i++) {
            meupodcast.reproducao();
        }

        for (int i = 0; i <1000 ; i++) {
            meupodcast.curte();
        }

        Preferencias minhaspreferenciais = new Preferencias();
        minhaspreferenciais.inclui(meupodcast);
        minhaspreferenciais.inclui(minhamusica);
        }
    }
