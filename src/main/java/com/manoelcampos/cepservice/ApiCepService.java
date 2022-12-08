package com.manoelcampos.cepservice;

import javax.enterprise.inject.Alternative;

@Alternative
public class ApiCepService extends AbstractCepService{
    public static final String DOMINIO = "https://cdn.apicep.com";

    public ApiCepService() {
        super(DOMINIO);
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("file/apicep/%s.json", cep);
    }
}
