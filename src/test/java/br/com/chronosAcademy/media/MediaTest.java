package br.com.chronosAcademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

//public todas as classes pode enxergar
//private somente essa classe pode enxergar
//protected somente o pacote br.com.chronosAcademy.media pode enxergar
public class MediaTest {

    @Test
    public void validaAprovado(){//método
        Media media = new Media(); //media é um objeto / instanciar o objeto para herdar os objetos e metodos
        String resultado = media.calculaMedia(5.0,5.0);
        assertEquals("Aprovado", resultado);
    }

    @Test
    public void validaReprovado(){//método
        Media media = new Media(); //media é um objeto / instanciar o objeto para herdar os objetos e metodos
        String resultado = media.calculaMedia(4.9,5.0);
        assertEquals("Reprovado", resultado);
    }

}