package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import RDPCrystalEDILibrary.*;public class GeneralEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public jio.System.Exception getException (){ try { return  (jio.System.Exception) javonetHandle.get("Exception");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public GeneralEventArgs (){  super((NObject) null); try {  javonetHandle = Javonet.New("GeneralEventArgs"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GeneralEventArgs (jio.System.Exception exception){  super((NObject) null); try {  javonetHandle = Javonet.New("GeneralEventArgs",exception); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GeneralEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}