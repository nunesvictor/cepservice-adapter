package com.manoelcampos.cepservice;

import javax.enterprise.inject.Alternative;

@Alternative
public class WidenetCepService extends AbstractCepService {
    private static final String DOMINIO = "https://apps.widenet.com.br";

    /**
     * Instancia o serviço de CEP, definindo a URL base para acesso.
     * O construtor é protegido, pois, não queremos que quem for utilizar
     * as subclasses desta, possa indicar o domínio.
     * Classes filhas como {@link ViaCepService} são utilizadas para acesso
     * a um serviço específico, cujo domínio é definida pela própria subclasse.
     * Quem for utilizar tal subclasse não deve ter permissão para alterar o domínio.
     *
     * @return
     */
    protected WidenetCepService() {
        super(DOMINIO);
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("busca-cep/api/cep.json?code=%s", cep);
    }
}
