package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;public class ToothSurface extends CompositeElement {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setToothSurfaceCode1 (java.lang.String value){ try { javonetHandle.set("ToothSurfaceCode1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getToothSurfaceCode1 (){ try { return  (java.lang.String) javonetHandle.get("ToothSurfaceCode1");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setToothSurfaceCode2 (java.lang.String value){ try { javonetHandle.set("ToothSurfaceCode2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getToothSurfaceCode2 (){ try { return  (java.lang.String) javonetHandle.get("ToothSurfaceCode2");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setToothSurfaceCode3 (java.lang.String value){ try { javonetHandle.set("ToothSurfaceCode3",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getToothSurfaceCode3 (){ try { return  (java.lang.String) javonetHandle.get("ToothSurfaceCode3");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setToothSurfaceCode4 (java.lang.String value){ try { javonetHandle.set("ToothSurfaceCode4",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getToothSurfaceCode4 (){ try { return  (java.lang.String) javonetHandle.get("ToothSurfaceCode4");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setToothSurfaceCode5 (java.lang.String value){ try { javonetHandle.set("ToothSurfaceCode5",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getToothSurfaceCode5 (){ try { return  (java.lang.String) javonetHandle.get("ToothSurfaceCode5");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public ToothSurface (){  super((NObject) null); try {  javonetHandle = Javonet.New("ToothSurface"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ToothSurface(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String GetString (java.lang.Character compElemSep){ try { return  (java.lang.String) javonetHandle.invoke("GetString",compElemSep);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}