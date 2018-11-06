package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.*;public class EDIFileLoader extends Component {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Double getTimeElapsed (){ try { return javonetHandle.get("TimeElapsed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setEDISource (EDISource value){ try { javonetHandle.set("EDISource",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public EDISource getEDISource (){ try { return EDISource.valueOf(((NEnum) javonetHandle.get("EDISource")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTrimString (java.lang.String value){ try { javonetHandle.set("TrimString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTrimString (){ try { return  (java.lang.String) javonetHandle.get("TrimString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFlatStructure (java.lang.Boolean value){ try { javonetHandle.set("FlatStructure",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getFlatStructure (){ try { return javonetHandle.get("FlatStructure");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setAutoDetectDelimiters (java.lang.Boolean value){ try { javonetHandle.set("AutoDetectDelimiters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAutoDetectDelimiters (){ try { return javonetHandle.get("AutoDetectDelimiters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setDelimiters (Delimiters value){ try { javonetHandle.set("Delimiters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Delimiters getDelimiters (){ try { return new Delimiters((NObject)javonetHandle.get("Delimiters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getErrorString (){ try { return  (java.lang.String) javonetHandle.get("ErrorString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEDIFileType (FileType value){ try { javonetHandle.set("EDIFileType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FileType getEDIFileType (){ try { return FileType.valueOf(((NEnum) javonetHandle.get("EDIFileType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDIFile (java.lang.String value){ try { javonetHandle.set("EDIFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIFile (){ try { return  (java.lang.String) javonetHandle.get("EDIFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFileBlockSize (java.lang.Integer value){ try { javonetHandle.set("FileBlockSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getFileBlockSize (){ try { return javonetHandle.get("FileBlockSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setEDIDataString (java.lang.String value){ try { javonetHandle.set("EDIDataString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIDataString (){ try { return  (java.lang.String) javonetHandle.get("EDIDataString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public EDIFileLoader (){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIFileLoader"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("FileLoadingCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIFileLoader.EDIFileLoadingCompletedEvent handler : _FileLoadingCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], FileLoadingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIFileLoader (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIFileLoader",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("FileLoadingCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIFileLoader.EDIFileLoadingCompletedEvent handler : _FileLoadingCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], FileLoadingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIFileLoader(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public EDILightWeightDocument LoadFile (java.lang.String ediFilePath){ try { return new EDILightWeightDocument((NObject)javonetHandle.invoke("LoadFile",ediFilePath));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public EDILightWeightDocument Load (java.lang.String ediData){ try { return new EDILightWeightDocument((NObject)javonetHandle.invoke("Load",ediData));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public EDILightWeightDocument Load (){ try { return new EDILightWeightDocument((NObject)javonetHandle.invoke("Load"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< EDIFileLoader.EDIFileLoadingCompletedEvent> _FileLoadingCompletedListeners = new java.util.ArrayList<EDIFileLoader.EDIFileLoadingCompletedEvent>();

            public void addFileLoadingCompleted(EDIFileLoader.EDIFileLoadingCompletedEvent toAdd)
            {
                _FileLoadingCompletedListeners.add(toAdd);
            }
            public void removeFileLoadingCompleted(EDIFileLoader.EDIFileLoadingCompletedEvent toRemove)
            {
                _FileLoadingCompletedListeners.remove(toRemove);
            }public static class EDIFileLoadingCompletedEvent extends MulticastDelegate {protected NObject javonetHandle; public EDIFileLoadingCompletedEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIFileLoadingCompletedEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIFileLoadingCompletedEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,FileLoadingEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,FileLoadingEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}