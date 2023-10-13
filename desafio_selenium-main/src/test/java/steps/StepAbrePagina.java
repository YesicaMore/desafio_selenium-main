package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import helpers.pageHelper;

public class StepAbrePagina {
    private pageHelper helper;

    @Before
    public void before() {
        helper = new pageHelper();
    }
    @After
    public void after() {
        helper.fecharBrowser();
    }
    @Dado("que esteja na página {string}")
    public void que_esteja_na_página(String url) {
        helper.AbrePagina(url);
    }
    @Quando("mudar o valor da combo Select version para {string}")
    public void mudar_o_valor_da_combo_select_version_para(String valor) {
        helper.mudarValorCombobox(valor);
    }
    @E("clicar no botão Add Customer")
    public void clicar_no_botão_add_customer() {
        helper.clicarBotaoAddCustomer();
    }
    @E("preencher o formulário de cliente com:")
    public void preencher_o_formulário_de_cliente_com(DataTable tabela) {
        helper.preencherFormulario(tabela);
    }
    @Então("verificar se o cliente foi adicionado com sucesso")
    public void verifico_se_o_cliente_foi_adicionado() {
        helper.validarMensagemSucesso();
    }
    //início do teste 2
    @Dado("que seja clicado no link Go back to list")
    public void que_seja_clicado_no_link_go_back_to_list() {
        helper.clicarGoBackToList();
    }
    @E("clicar na coluna Search Name")
    public void clicar_na_coluna() {
        helper.clicarNaColuna();
    }
    @E("digitar o conteúdo do nome {string}")
    public void digitar_o_conteúdo_do_nome(String nome) {
        helper.digitarNome(nome);
    }
    @E("clicar no checkbox abaixo da palavra Actions")
    public void clicar_no_checkbox_abaixo_da_palavra_actions() {
        helper.clicarAbaixoActions();
    }
    @E("clicar no botão Delete")
    public void clicar_no_botão_delete() {
        helper.clicarDelete();
    }
    @Então("validar o texto {string} através de uma asserção para a popup que será apresentada")
    public void validar_o_texto_através_de_uma_asserção_para_a_popup_que_será_apresentada(String textoEsperado) {
        helper.validarMensagemBox(textoEsperado);
    }
    @Quando("clicar no botão Delete da popup")
    public void clicar_no_botão_da_popup() {
        helper.confirmarDelete();
    }
    @Então("validar a mensagem {string} dentro de um box verde na parte superior direita da tela")
    public void validar_a_mensagem_dentro_de_um_box_verde_na_parte_superior_direita_da_tela(String mensagem) {
        helper.validarMensagemSucesso(mensagem);
    }
}
