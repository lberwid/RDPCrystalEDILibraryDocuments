package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.ObjectModel.*;public class Mask {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public List<java.lang.String> getMaskData (){ try { return new List<java.lang.String>((NObject)javonetHandle.get("MaskData"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Collection<Usage> getUsages (){ try { return new Collection<Usage>((NObject)javonetHandle.get("Usages"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Mask (){ try {  javonetHandle = Javonet.New("Mask");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Mask(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}