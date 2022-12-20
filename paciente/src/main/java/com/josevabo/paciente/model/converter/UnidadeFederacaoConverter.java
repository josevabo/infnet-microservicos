package com.josevabo.paciente.model.converter;

import com.josevabo.paciente.model.UnidadeFederacao;
import jakarta.persistence.AttributeConverter;

public class UnidadeFederacaoConverter implements AttributeConverter<UnidadeFederacao, String> {

    @Override
    public UnidadeFederacao convertToEntityAttribute(String uf) {
        return UnidadeFederacao.fromSigla(uf);
    }

    @Override
    public String convertToDatabaseColumn(UnidadeFederacao unidadeFederacao) {
        if (unidadeFederacao == null) return null;
        return unidadeFederacao.sigla();
    }
}
