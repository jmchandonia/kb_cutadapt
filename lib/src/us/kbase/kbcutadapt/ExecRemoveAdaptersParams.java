
package us.kbase.kbcutadapt;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: exec_RemoveAdaptersParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "output_workspace",
    "output_object_name",
    "reads_type",
    "input_reads",
    "five_prime",
    "three_prime",
    "error_tolerance",
    "min_overlap_length"
})
public class ExecRemoveAdaptersParams {

    @JsonProperty("output_workspace")
    private String outputWorkspace;
    @JsonProperty("output_object_name")
    private String outputObjectName;
    @JsonProperty("reads_type")
    private String readsType;
    @JsonProperty("input_reads")
    private String inputReads;
    /**
     * <p>Original spec-file type: FivePrimeOptions</p>
     * <pre>
     * unfortunately, we have to name the fields uniquely between
     *  3' and 5' options due to the current implementation of grouped
     * parameters
     * </pre>
     * 
     */
    @JsonProperty("five_prime")
    private FivePrimeOptions fivePrime;
    /**
     * <p>Original spec-file type: ThreePrimeOptions</p>
     * 
     * 
     */
    @JsonProperty("three_prime")
    private ThreePrimeOptions threePrime;
    @JsonProperty("error_tolerance")
    private Double errorTolerance;
    @JsonProperty("min_overlap_length")
    private Long minOverlapLength;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("output_workspace")
    public String getOutputWorkspace() {
        return outputWorkspace;
    }

    @JsonProperty("output_workspace")
    public void setOutputWorkspace(String outputWorkspace) {
        this.outputWorkspace = outputWorkspace;
    }

    public ExecRemoveAdaptersParams withOutputWorkspace(String outputWorkspace) {
        this.outputWorkspace = outputWorkspace;
        return this;
    }

    @JsonProperty("output_object_name")
    public String getOutputObjectName() {
        return outputObjectName;
    }

    @JsonProperty("output_object_name")
    public void setOutputObjectName(String outputObjectName) {
        this.outputObjectName = outputObjectName;
    }

    public ExecRemoveAdaptersParams withOutputObjectName(String outputObjectName) {
        this.outputObjectName = outputObjectName;
        return this;
    }

    @JsonProperty("reads_type")
    public String getReadsType() {
        return readsType;
    }

    @JsonProperty("reads_type")
    public void setReadsType(String readsType) {
        this.readsType = readsType;
    }

    public ExecRemoveAdaptersParams withReadsType(String readsType) {
        this.readsType = readsType;
        return this;
    }

    @JsonProperty("input_reads")
    public String getInputReads() {
        return inputReads;
    }

    @JsonProperty("input_reads")
    public void setInputReads(String inputReads) {
        this.inputReads = inputReads;
    }

    public ExecRemoveAdaptersParams withInputReads(String inputReads) {
        this.inputReads = inputReads;
        return this;
    }

    /**
     * <p>Original spec-file type: FivePrimeOptions</p>
     * <pre>
     * unfortunately, we have to name the fields uniquely between
     *  3' and 5' options due to the current implementation of grouped
     * parameters
     * </pre>
     * 
     */
    @JsonProperty("five_prime")
    public FivePrimeOptions getFivePrime() {
        return fivePrime;
    }

    /**
     * <p>Original spec-file type: FivePrimeOptions</p>
     * <pre>
     * unfortunately, we have to name the fields uniquely between
     *  3' and 5' options due to the current implementation of grouped
     * parameters
     * </pre>
     * 
     */
    @JsonProperty("five_prime")
    public void setFivePrime(FivePrimeOptions fivePrime) {
        this.fivePrime = fivePrime;
    }

    public ExecRemoveAdaptersParams withFivePrime(FivePrimeOptions fivePrime) {
        this.fivePrime = fivePrime;
        return this;
    }

    /**
     * <p>Original spec-file type: ThreePrimeOptions</p>
     * 
     * 
     */
    @JsonProperty("three_prime")
    public ThreePrimeOptions getThreePrime() {
        return threePrime;
    }

    /**
     * <p>Original spec-file type: ThreePrimeOptions</p>
     * 
     * 
     */
    @JsonProperty("three_prime")
    public void setThreePrime(ThreePrimeOptions threePrime) {
        this.threePrime = threePrime;
    }

    public ExecRemoveAdaptersParams withThreePrime(ThreePrimeOptions threePrime) {
        this.threePrime = threePrime;
        return this;
    }

    @JsonProperty("error_tolerance")
    public Double getErrorTolerance() {
        return errorTolerance;
    }

    @JsonProperty("error_tolerance")
    public void setErrorTolerance(Double errorTolerance) {
        this.errorTolerance = errorTolerance;
    }

    public ExecRemoveAdaptersParams withErrorTolerance(Double errorTolerance) {
        this.errorTolerance = errorTolerance;
        return this;
    }

    @JsonProperty("min_overlap_length")
    public Long getMinOverlapLength() {
        return minOverlapLength;
    }

    @JsonProperty("min_overlap_length")
    public void setMinOverlapLength(Long minOverlapLength) {
        this.minOverlapLength = minOverlapLength;
    }

    public ExecRemoveAdaptersParams withMinOverlapLength(Long minOverlapLength) {
        this.minOverlapLength = minOverlapLength;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((((((((("ExecRemoveAdaptersParams"+" [outputWorkspace=")+ outputWorkspace)+", outputObjectName=")+ outputObjectName)+", readsType=")+ readsType)+", inputReads=")+ inputReads)+", fivePrime=")+ fivePrime)+", threePrime=")+ threePrime)+", errorTolerance=")+ errorTolerance)+", minOverlapLength=")+ minOverlapLength)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
