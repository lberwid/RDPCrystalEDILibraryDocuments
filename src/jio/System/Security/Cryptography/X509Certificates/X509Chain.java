package jio.System.Security.Cryptography.X509Certificates;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.*;public class X509Chain {public NObject javonetHandle; public X509Chain (){ try {  javonetHandle = Javonet.New("X509Chain");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public X509Chain (java.lang.Boolean useMachineContext){ try {  javonetHandle = Javonet.New("X509Chain",useMachineContext);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public X509Chain (java.lang.Integer chainContext){ try {  javonetHandle = Javonet.New("X509Chain",chainContext);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public X509Chain(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}