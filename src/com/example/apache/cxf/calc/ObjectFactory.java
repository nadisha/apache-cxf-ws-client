
package com.example.apache.cxf.calc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.apache.cxf.calc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://calc.cxf.apache.example.com/", "add");
    private final static QName _Div_QNAME = new QName("http://calc.cxf.apache.example.com/", "div");
    private final static QName _Sub_QNAME = new QName("http://calc.cxf.apache.example.com/", "sub");
    private final static QName _SubResponse_QNAME = new QName("http://calc.cxf.apache.example.com/", "subResponse");
    private final static QName _DivResponse_QNAME = new QName("http://calc.cxf.apache.example.com/", "divResponse");
    private final static QName _AddResponse_QNAME = new QName("http://calc.cxf.apache.example.com/", "addResponse");
    private final static QName _MultiResponse_QNAME = new QName("http://calc.cxf.apache.example.com/", "multiResponse");
    private final static QName _GetOutputResponse_QNAME = new QName("http://calc.cxf.apache.example.com/", "getOutputResponse");
    private final static QName _GetOutput_QNAME = new QName("http://calc.cxf.apache.example.com/", "getOutput");
    private final static QName _Multi_QNAME = new QName("http://calc.cxf.apache.example.com/", "multi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.apache.cxf.calc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiResponse }
     * 
     */
    public MultiResponse createMultiResponse() {
        return new MultiResponse();
    }

    /**
     * Create an instance of {@link GetOutputResponse }
     * 
     */
    public GetOutputResponse createGetOutputResponse() {
        return new GetOutputResponse();
    }

    /**
     * Create an instance of {@link GetOutput }
     * 
     */
    public GetOutput createGetOutput() {
        return new GetOutput();
    }

    /**
     * Create an instance of {@link Multi }
     * 
     */
    public Multi createMulti() {
        return new Multi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<Sub>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<SubResponse>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "multiResponse")
    public JAXBElement<MultiResponse> createMultiResponse(MultiResponse value) {
        return new JAXBElement<MultiResponse>(_MultiResponse_QNAME, MultiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutputResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "getOutputResponse")
    public JAXBElement<GetOutputResponse> createGetOutputResponse(GetOutputResponse value) {
        return new JAXBElement<GetOutputResponse>(_GetOutputResponse_QNAME, GetOutputResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "getOutput")
    public JAXBElement<GetOutput> createGetOutput(GetOutput value) {
        return new JAXBElement<GetOutput>(_GetOutput_QNAME, GetOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.cxf.apache.example.com/", name = "multi")
    public JAXBElement<Multi> createMulti(Multi value) {
        return new JAXBElement<Multi>(_Multi_QNAME, Multi.class, null, value);
    }

}
