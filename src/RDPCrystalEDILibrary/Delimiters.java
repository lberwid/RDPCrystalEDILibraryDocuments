package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;public class Delimiters {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setElementTerminatorCharacter (java.lang.Character value){ try { javonetHandle.set("ElementTerminatorCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getElementTerminatorCharacter (){ try { return javonetHandle.get("ElementTerminatorCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSegmentTerminatorCharacter (java.lang.Character value){ try { javonetHandle.set("SegmentTerminatorCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getSegmentTerminatorCharacter (){ try { return javonetHandle.get("SegmentTerminatorCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCompositeTerminatorCharacter (java.lang.Character value){ try { javonetHandle.set("CompositeTerminatorCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getCompositeTerminatorCharacter (){ try { return javonetHandle.get("CompositeTerminatorCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUsingDefault (){ try { return javonetHandle.get("UsingDefault");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setRepetitionCharacter (java.lang.Character value){ try { javonetHandle.set("RepetitionCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getRepetitionCharacter (){ try { return javonetHandle.get("RepetitionCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setReleaseCharacter (java.lang.Character value){ try { javonetHandle.set("ReleaseCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getReleaseCharacter (){ try { return javonetHandle.get("ReleaseCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Delimiters (){ try {  javonetHandle = Javonet.New("Delimiters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Delimiters(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}