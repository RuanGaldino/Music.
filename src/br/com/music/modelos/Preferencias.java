package br.com.music.modelos;

public class Preferencias {

    public void inclui(Audio audio){
     if (audio.getClassificacao() >= 9){
         System.out.println(audio.getTitulo() + " é considerado sucesso" + " e preferido por todos!" );
     }else {
         System.out.println(audio.getTitulo() + " muitas pessoas estão gostando");
     }
    }
}
