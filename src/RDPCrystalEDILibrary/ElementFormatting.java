package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;
import jio.System.Collections.ObjectModel.*;public class ElementFormatting {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setElementNumber (java.lang.Integer value){ try { javonetHandle.set("ElementNumber",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getElementNumber (){ try { return javonetHandle.get("ElementNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setElementFormatInfos (Collection<ElementFormatInfo> value){ try { javonetHandle.set("ElementFormatInfos",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Collection<ElementFormatInfo> getElementFormatInfos (){ try { return new Collection<ElementFormatInfo>((NObject)javonetHandle.get("ElementFormatInfos"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ElementFormatting (){ try {  javonetHandle = Javonet.New("ElementFormatting");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ElementFormatting(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}