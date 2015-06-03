package com.tutosandroidfrance.dagger2sample.dagger2.module;

import android.content.Context;

import com.tutosandroidfrance.dagger2sample.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Ce module sert à fournir le contexte courant (l'application)
 */
@Module
public class AppModule {

    private final Application context;

    /**
     * Nous ajoutons volontairement un constructeur qui prend un Context en entrée,
     * afin de lui fournir au runtime lors de la création de l'Application
     * @param context l'application créée
     */
    public AppModule(Application context) {
        this.context = context;
    }

    /**
     * Permet à Dagger2 de récupérer le context
     * @return le context de l'application
     */
    @Provides
    Context provideContext() {
        return context;
    }

}
