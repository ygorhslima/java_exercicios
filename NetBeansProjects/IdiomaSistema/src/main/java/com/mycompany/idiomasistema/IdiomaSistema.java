package com.mycompany.idiomasistema;

import java.util.Locale;
        
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idiomaSistema = Locale.getDefault();
        System.out.println("Idioma do sistema " + idiomaSistema.getLanguage());
    }
}
