package test;

import org.junit.Before;
import org.junit.Test;




public class CadastroRepresentante extends RepBase {

    @Before
    public void CadastroRe() throws InterruptedException {

        //Clicando na seta de boas vindas
        clickById("com.blu.blurep:id/onboarding_next");

        //clicando no Onboard
        clickById("com.blu.blurep:id/onboarding_next");

        //clicando no botão entrar
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(3000);
    }

    @Test
    public void CadastrarRep() throws InterruptedException {
        Thread.sleep(2000);

        //Clicando em QUERO FAZER PARTE
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button");
        Thread.sleep(2000);

        //Inserindo o CPF/CNPJ do Representante
        sendKeysById("com.blu.blurep:id/form_field_input", "15008965000");
        Thread.sleep(2000);

        //clicando em CONTINUAR
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);

        //Informe seu nome completo
        sendKeysByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText", "Bruno de Lima Inácio");
        Thread.sleep(2000);

        //Celular com DDD
        sendKeysByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText", "21987905313");
        Thread.sleep(2000);

        //Email
        sendKeysByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText", "brunoi.inacio7@useblu.com.br");
        Thread.sleep(2000);

        //Já Conhecia a Blu
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.Spinner/android.widget.TextView");
        Thread.sleep(2000);

        //Opção - Não, não conhecia
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        Thread.sleep(2000);

        //Clicando em CONTINUAR
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);


        //Escolhendo o Estado
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.Spinner/android.widget.TextView");
        Thread.sleep(2000);

        //Escolhendo Acre
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        Thread.sleep(2000);

        //Principal Fornecedor
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");
        Thread.sleep(2000);

        //escolhendo outro
        sendKeysById("com.blu.blurep:id/search_field_activity_input", "FABRICANTE 17");
        Thread.sleep(2000);

        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView");
        Thread.sleep(2000);

        //Digitando o Nome do Fornecedor
        sendKeysByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText", "YHWH");
        Thread.sleep(2000);

        //Inserindo Outros Fornecedores
        sendKeysById("com.blu.blurep:id/form_field_multi_value_input", "JAH");
        Thread.sleep(2000);
        clickById("com.blu.blurep:id/form_field_multi_value_icon");
        Thread.sleep(2000);

        sendKeysById("com.blu.blurep:id/form_field_multi_value_input", "Alfa Omega");
        Thread.sleep(2000);
        clickById("com.blu.blurep:id/form_field_multi_value_icon");

        //Problabilidade de Escolher a Blu
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button[5]");
        Thread.sleep(2000);

        //Eu aceito os termos e condições da Campanha Blu Rep Nota 1.000.
        clickById("com.blu.blurep:id/new_rep_register2_form_terms");
        Thread.sleep(2000);

        MetodoScroll.swipeScreenWithLogs("UP");
        Thread.sleep(2000);

        //Botão Finalizar
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);

        //Botão Fazer Login
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);
    }
}

