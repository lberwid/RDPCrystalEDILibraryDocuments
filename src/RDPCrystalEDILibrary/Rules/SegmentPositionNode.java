package RDPCrystalEDILibrary.Rules;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Rules.*;
import jio.System.Collections.Generic.*;
import RDPCrystalEDILibrary.*;public class SegmentPositionNode extends Node {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public List<java.lang.Integer> getValues (){ try { return new List<java.lang.Integer>((NObject)javonetHandle.get("Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setValues (List<java.lang.Integer> param){ try { javonetHandle.set("Values",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public ElementPosition getElementPosition (){ try { return new ElementPosition((NObject)javonetHandle.get("ElementPosition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setElementPosition (ElementPosition param){ try { javonetHandle.set("ElementPosition",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SegmentPositionNode (java.lang.String text,java.lang.Integer depth){  super((NObject) null); try {  javonetHandle = Javonet.New("SegmentPositionNode",text,depth); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SegmentPositionNode(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToRuleString (){ try { return  (java.lang.String) javonetHandle.invoke("ToRuleString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}