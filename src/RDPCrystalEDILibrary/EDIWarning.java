package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;public class EDIWarning extends EDIError {public NObject javonetHandle; public EDIWarning (){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIWarning"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIWarning (java.lang.Integer lineNumber,java.lang.String loop,java.lang.String segment,java.lang.Integer elementOrdinal,java.lang.Integer compositeElementOrd,EDIValidationMessage message,java.lang.String description,LightWeightSegment currentSTSegment,LightWeightSegment currentGSSegment,java.lang.String position,java.lang.Long segmentPosition,DataSegment schemaSeg){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIWarning",lineNumber,loop,segment,elementOrdinal,compositeElementOrd,NEnum.fromJavaEnum(message),description,currentSTSegment,currentGSSegment,position,segmentPosition,schemaSeg); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIWarning(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}