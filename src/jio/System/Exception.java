package jio.System;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;public class Exception {public NObject javonetHandle; public Exception (){ try {  javonetHandle = Javonet.New("Exception");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Exception (java.lang.String message){ try {  javonetHandle = Javonet.New("Exception",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Exception (java.lang.String message,jio.System.Exception innerException){ try {  javonetHandle = Javonet.New("Exception",message,innerException);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Exception(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}