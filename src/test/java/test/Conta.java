package test;

import org.junit.Before;
import org.junit.Test;

public class Conta extends RepBase {

    @Before
    public void CadastroRep() throws InterruptedException {

        //Clicando na seta de boas vindas
        clickById("com.blu.blurep:id/onboarding_next");

        //clicando no Onboard
        clickById("com.blu.blurep:id/onboarding_next");

        //clicando no botão entrar
        clickById("com.blu.blurep:id/form_button");

    }

    @Test
    public void CadRepIndicacoes() throws InterruptedException {

        //Clicando no Botão Entrar
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.Button");

        //INSERINDO EMAIL
        sendKeysByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText", "test.partner@pag.net");

        //Inserindo SENHA
        sendKeysByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText", "Pagnet123");

        //clicando em ENTRAR
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.Button");

        //LOGIN COM BIOMETRIA - NÃO
       // clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button");
       // Thread.sleep(2000);

        //Clicando no Toolbar CONTA
        clickByXPath("//android.widget.FrameLayout[@content-desc=\"Conta\"]/android.view.ViewGroup/android.widget.TextView");
        Thread.sleep(2000);

        // Clicando em Login com Biometria
        clickById("com.blu.blurep:id/account_biometric");
        Thread.sleep(2000);
        clickById("com.blu.blurep:id/account_biometric");
        Thread.sleep(2000);

        //Clicando Notificação
        clickById("com.blu.blurep:id/account_notifications");
        Thread.sleep(2000);
        clickById("com.blu.blurep:id/account_notifications");
        Thread.sleep(2000);

        //Rolando a tela para baixo
        MetodoScroll.swipeScreenWithLogs("UP");
        Thread.sleep(2000);

        //clicando SOBRE A BLU
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
        Thread.sleep(2000);
        MetodoScroll.swipeScreenWithLogs("UP");
        MetodoScroll.swipeScreenWithLogs("UP");
        Thread.sleep(2000);
        MetodoScroll.swipeScreenWithLogs("DOWN");
        MetodoScroll.swipeScreenWithLogs("DOWN");
        //Clicando na seta voltar
        clickById("com.blu.blurep:id/back_button");

        //Clicando em TERMOS E CONDIÇÕES
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");
        Thread.sleep(2000);
        MetodoScroll.swipeScreenWithLogs("UP");
        MetodoScroll.swipeScreenWithLogs("UP");
        Thread.sleep(2000);
        MetodoScroll.swipeScreenWithLogs("DOWN");
        MetodoScroll.swipeScreenWithLogs("DOWN");

        //Clicando na seta voltar
        clickById("com.blu.blurep:id/back_button");
        Thread.sleep(2000);

        //CLICANDO EM SAIR DA CONTA
        clickById("com.blu.blurep:id/account_logout");
        Thread.sleep(2000);
    }
    }
