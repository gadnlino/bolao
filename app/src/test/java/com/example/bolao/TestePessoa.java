package com.example.bolao;

import com.example.bolao.model.Pessoa;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestePessoa {

    @Test
    public void criaPessoa(){
        Pessoa p = new Pessoa("Guilherme","965961787");
        assertEquals("Guilherme",p.getNome());
        assertEquals("965961787",p.getTelefone());
    }

    @Test
    public void modificaPessoa(){
        Pessoa p = new Pessoa();
        p.setNome("Marcio");
        assertEquals("Marcio",p.getNome());
        p.setNome("Mario");
        assertEquals("Mario",p.getNome());
    }
}
