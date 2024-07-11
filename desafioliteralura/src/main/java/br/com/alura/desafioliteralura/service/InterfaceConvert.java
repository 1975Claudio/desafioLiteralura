package br.com.alura.desafioliteralura.service;

public interface InterfaceConvert {
    <T> T obterDados(String json, Class<T> classe);
}
