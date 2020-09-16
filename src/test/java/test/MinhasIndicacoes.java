package test;

import org.junit.Before;
import org.junit.Test;



public class MinhasIndicacoes extends RepBase {

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
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button");
        Thread.sleep(2000);

        //CLICANDO NO ICONE INDICAÇÕES
        clickByXPath("//android.widget.FrameLayout[@content-desc=\"Indicações\"]/android.view.ViewGroup/android.widget.TextView");
        Thread.sleep(2000);

        //clicando no poup CONTINUE INDICANDO
        clickById("com.blu.blurep:id/close_button");
        Thread.sleep(2000);

        //Clicando em VER MINHAS INDICAÇÕES
        clickByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button");
        Thread.sleep(2000);

        //new TouchAction((MobileDriver) driver).press(FirstElement).waitAction(Duration.ofMillis(duration)).moveTo(endx, endy).release().perform();

        //Rolando para BAIXO para validar se tem TOP3 Cliente
        MetodoScroll.swipeScreenWithLogs("UP");
        Thread.sleep(2000);

        //Rolando para baixo ALTO para validar se tem TOP3 Cliente
        MetodoScroll.swipeScreenWithLogs("DOWN");
        Thread.sleep(2000);

        MetodoScroll.swipeScreenWithLogs("LEFT");
        Thread.sleep(2000);

        MetodoScroll.swipeScreenWithLogs("RIGHT");
        Thread.sleep(2000);

        //Clicando no  tooltip Cliente INDICADO
        clickById("com.blu.blurep:id/recommendations_summary_status_ico1");
        Thread.sleep(2000);
        clickById("com.blu.blurep:id/recommendations_summary_status_ico1");

        //Clicando Para ver os INDICADOS
        clickById("com.blu.blurep:id/recommendations_summary_status_number1");

        //Clicando MAIS RECENTE
        clickById("com.blu.blurep:id/recommendations_view_list_order");
        Thread.sleep(2000);

        //ORDENAR POR AZ
        clickById("com.blu.blurep:id/recommendations_view_list_order_option1_img");
        Thread.sleep(2000);

        //TROCANDO ORDEM
        clickById("com.blu.blurep:id/recommendations_view_list_order");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_order_option2_img");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_order");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_order_option3_img");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_order");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_order_option4_img");
        Thread.sleep(2000);

        //CLIENTE RECOMENDADO TROCANDO AS ORDENS

        clickById("com.blu.blurep:id/recommendations_view_list_filter");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option2_img");
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_filter");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option3_img");
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_filter");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option4_img");
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_filter");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option5_img");
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_filter");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option1_img");
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);

        clickById("com.blu.blurep:id/recommendations_view_list_filter");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option1_img");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option2_img");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option3_img");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option4_img");
        clickById("com.blu.blurep:id/recommendations_view_list_filter_option5_img");
        clickById("com.blu.blurep:id/form_button");
        Thread.sleep(2000);
    }


}
