package RDPCrystalEDILibrary.Rules;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Rules.*;public class Indexer extends Node {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getIndex (){ try { return javonetHandle.get("Index");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setIndex (java.lang.Integer param){ try { javonetHandle.set("Index",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Indexer (java.lang.String text,java.lang.Integer depth){  super((NObject) null); try {  javonetHandle = Javonet.New("Indexer",text,depth); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Indexer(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}