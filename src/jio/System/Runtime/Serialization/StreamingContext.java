package jio.System.Runtime.Serialization;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Runtime.Serialization.*;
import jio.System.*;public class StreamingContext {public NObject javonetHandle; public StreamingContext (StreamingContextStates state){ try {  javonetHandle = Javonet.New("StreamingContext",NEnum.fromJavaEnum(state));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StreamingContext (StreamingContextStates state,NObject additional){ try {  javonetHandle = Javonet.New("StreamingContext",NEnum.fromJavaEnum(state),additional);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public StreamingContext(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}