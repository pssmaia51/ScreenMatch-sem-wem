package br.com.alura.ScrenmatchII.service;

public interface IConverterDados {

    <T> T obterDados(String json, Class<T> classe);


}
