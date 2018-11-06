package jio.System.Runtime.Serialization;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Runtime.Serialization.*;
import jio.System.*;public class SerializationInfo {public NObject javonetHandle; public SerializationInfo (Class type,IFormatterConverter converter){ try {  javonetHandle = Javonet.New("SerializationInfo",Javonet.getType(getReturnObjectName(type).getTypeName()),converter);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SerializationInfo (Class type,IFormatterConverter converter,java.lang.Boolean requireSameTokenInPartialTrust){ try {  javonetHandle = Javonet.New("SerializationInfo",Javonet.getType(getReturnObjectName(type).getTypeName()),converter,requireSameTokenInPartialTrust);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SerializationInfo(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}