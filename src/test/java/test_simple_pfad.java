import generated.TC_Process_0c5puar__Pfad_False;
import generated.TC_Process_0c5puar__Pfad_True;
import org.junit.Rule;
import org.junit.Test;

public class test_simple_pfad {
    @Rule
    public TC_Process_0c5puar__Pfad_False tc_false = new TC_Process_0c5puar__Pfad_False();

    @Rule
    public TC_Process_0c5puar__Pfad_True tc_true = new TC_Process_0c5puar__Pfad_True();


    @Test
    public void test_execute_false() {
        tc_false.handleActivity_17qo1e7().withVariable("Decision", false);
        tc_false.createExecutor().execute();
    }

    @Test
    public void test_execute_true_isEnded() {
        tc_true.handleActivity_17qo1e7().withVariable("Decision", true);
        tc_true.createExecutor().verify(pi -> {
            pi.isEnded();
        }).execute();
    }

    @Test
    public void test_execute_true_executes() {
        tc_true.handleActivity_17qo1e7().withVariable("Decision", true);
        tc_true.createExecutor().execute();
    }



}
