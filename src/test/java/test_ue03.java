import org.junit.Rule;
import org.junit.Test;

import generated.TC_Process_09urruw__Großtest_Möbelnachrichten;
import generated.TC_Process_09urruw__Großtest_Waschmaschine_verkaufen;
import generated.TC_Process_09urruw__Großtest_easyway_start_to_finish;
import generated.TC_Process_09urruw__Internet_vorhanden_2;
import generated.TC_Process_09urruw__Move_2N;
import generated.TC_Process_09urruw__full02;
import generated.TC_Process_09urruw__gatewaypath;
import generated.TC_Process_09urruw__move_3n;
import generated.TC_Process_09urruw__move_5n;
import generated.TC_Process_09urruw__move_6n;
import generated.TC_Process_09urruw__move_8n;
import generated.TC_Process_09urruw__move_9n;
import generated.TC_Process_09urruw__parallelKaution1;
import generated.TC_Process_09urruw__parallelKaution1v2;
import generated.TC_Process_09urruw__parallelKaution2;
import generated.TC_Process_09urruw__parallelKaution2v2;
import generated.TC_Process_09urruw__random01_7n;
import generated.TC_Process_09urruw__random02_6n;

public class test_ue03 {

    @Rule
    public TC_Process_09urruw__Move_2N tc2n = new TC_Process_09urruw__Move_2N();

    @Test
    public void test2n() {
        tc2n.createExecutor().execute();
    }

    @Rule
    public TC_Process_09urruw__move_3n tc3n = new TC_Process_09urruw__move_3n();

    @Test
    public void test3n() {
        tc3n.createExecutor().execute();
        // "Nachricht gesendet" prüfen?
    }


    //5
    @Rule
    public TC_Process_09urruw__move_5n tc5n = new TC_Process_09urruw__move_5n();

    @Test
    public void test5n() {
        tc5n.createExecutor().execute();
        // "Nachricht empfangen" prüfen?
    }


    // internet vorhanden?
    @Rule
    public TC_Process_09urruw__Internet_vorhanden_2 tcInetVorh = new TC_Process_09urruw__Internet_vorhanden_2();

    @Test
    public void testInetVorh() {
        tcInetVorh.handleActivity_1gdb445().withVariable("Bestandsinternet", false);
        tcInetVorh.createExecutor().execute();
        // "Nachricht empfangen" prüfen?
    }

    // parallel gateway Kaution, Start auf parallel Gateway
    @Rule
    public TC_Process_09urruw__parallelKaution1 tcKaut1 = new TC_Process_09urruw__parallelKaution1();

    @Test
    public void testKaut1() {
        tcKaut1.createExecutor().execute();
        // "Nachricht empfangen" prüfen?
    }

    @Rule
    public TC_Process_09urruw__parallelKaution2 tcKaut2 = new TC_Process_09urruw__parallelKaution2();

    @Test
    public void testKaut2() {
        tcKaut2.createExecutor().execute();
        // "Nachricht empfangen" prüfen?
    }





    // parallel gateway Kaution, Start VOR parallel Gateway
    @Rule
    public TC_Process_09urruw__parallelKaution1v2 tcKaut1v2 = new TC_Process_09urruw__parallelKaution1v2();

    @Test
    public void testKaut1v2() {
        tcKaut1v2.createExecutor().execute();
        // "Nachricht empfangen" prüfen?
    }

    @Rule
    public TC_Process_09urruw__parallelKaution2v2 tcKaut2v2 = new TC_Process_09urruw__parallelKaution2v2();

    @Test
    public void testKaut2v2() {
        tcKaut2v2.createExecutor().execute();
        // "Nachricht empfangen" prüfen?
    }




    //6
    @Rule
    public TC_Process_09urruw__move_6n tc6n = new TC_Process_09urruw__move_6n();

    @Test
    public void test6n() {
        tc6n.createExecutor().execute();
        // Usertask "Angebot prüfen" prüfen
    }



    //8
    @Rule
    public TC_Process_09urruw__move_8n tc8n = new TC_Process_09urruw__move_8n();

    @Test
    public void test8n() {
      tc8n.handleEvent_0rthg9y().withVariable("Angebotsannahme", true);

        tc8n.createExecutor().execute();
        // Schleife durchlaufen?
    }


    //9
    @Rule
    public TC_Process_09urruw__move_9n tc9n = new TC_Process_09urruw__move_9n();

    @Test
    public void test9n() {
        tc9n.handleActivity_0sfnj58().withVariable("Angebotsannahme", true);
        tc9n.createExecutor().execute();

        // Schleife durchlaufen?
    }

    //langtests
    @Rule
    public TC_Process_09urruw__Großtest_Waschmaschine_verkaufen tcWamaVerk = new TC_Process_09urruw__Großtest_Waschmaschine_verkaufen();

    @Test
    public void testWamaVerk() {
        tcWamaVerk.createExecutor().execute();
    }

    @Rule
    public TC_Process_09urruw__Großtest_Möbelnachrichten tcMoebelnach = new TC_Process_09urruw__Großtest_Möbelnachrichten();

    @Test
    public void testMoebelnach() {
        tcMoebelnach.createExecutor().execute();
    }

    @Rule
    public TC_Process_09urruw__Großtest_easyway_start_to_finish tcFinish = new TC_Process_09urruw__Großtest_easyway_start_to_finish();

    @Test
    public void testFinish() {
        tcFinish.createExecutor().execute();
    }

    @Rule
    public TC_Process_09urruw__full02 tc02 = new TC_Process_09urruw__full02();

    @Test
    public void testf02() {
        tc02.createExecutor().execute();
    }

    @Rule
    public TC_Process_09urruw__random01_7n tcR017n = new TC_Process_09urruw__random01_7n();

    @Test
    public void testR01() {
        tcR017n.handleActivity_0xe2mks().withVariable("Unterausstattung", true);
        tcR017n.createExecutor().execute();
    }

    @Rule
    public TC_Process_09urruw__random02_6n tcR026n = new TC_Process_09urruw__random02_6n();

    @Test
    public void testR02() {
        tcR026n.handleActivity_0xe2mks().withVariable("Unterausstattung", false);
        tcR026n.createExecutor().execute();
    }

    @Rule
    public TC_Process_09urruw__gatewaypath tcGateway = new TC_Process_09urruw__gatewaypath();

    @Test
    public void testGateways() {
        tcGateway.createExecutor().execute();
    }


}
