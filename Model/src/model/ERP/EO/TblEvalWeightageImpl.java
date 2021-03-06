package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 18 22:45:51 PDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblEvalWeightageImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        GroupCompanyId,
        GradeId,
        TermId,
        LookupEvaluation,
        LookupDTopic1,
        Topic1Marks,
        LookupDTopic2,
        Topic2Marks,
        EvaType,
        TotalMarks,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        CompanySbuId,
        TblGrade,
        TblLookupDetail,
        TblLookupDetailD,
        TblLookupDetailD1,
        TblTerms;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();
    public static final int GRADEID = AttributesEnum.GradeId.index();
    public static final int TERMID = AttributesEnum.TermId.index();
    public static final int LOOKUPEVALUATION = AttributesEnum.LookupEvaluation.index();
    public static final int LOOKUPDTOPIC1 = AttributesEnum.LookupDTopic1.index();
    public static final int TOPIC1MARKS = AttributesEnum.Topic1Marks.index();
    public static final int LOOKUPDTOPIC2 = AttributesEnum.LookupDTopic2.index();
    public static final int TOPIC2MARKS = AttributesEnum.Topic2Marks.index();
    public static final int EVATYPE = AttributesEnum.EvaType.index();
    public static final int TOTALMARKS = AttributesEnum.TotalMarks.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int TBLGRADE = AttributesEnum.TblGrade.index();
    public static final int TBLLOOKUPDETAIL = AttributesEnum.TblLookupDetail.index();
    public static final int TBLLOOKUPDETAILD = AttributesEnum.TblLookupDetailD.index();
    public static final int TBLLOOKUPDETAILD1 = AttributesEnum.TblLookupDetailD1.index();
    public static final int TBLTERMS = AttributesEnum.TblTerms.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblEvalWeightageImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblEvalWeightage");
    }


    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for GroupCompanyId, using the alias name GroupCompanyId.
     * @return the value of GroupCompanyId
     */
    public Number getGroupCompanyId() {
        return (Number) getAttributeInternal(GROUPCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GroupCompanyId.
     * @param value value to set the GroupCompanyId
     */
    public void setGroupCompanyId(Number value) {
        setAttributeInternal(GROUPCOMPANYID, value);
    }

    /**
     * Gets the attribute value for GradeId, using the alias name GradeId.
     * @return the value of GradeId
     */
    public BigDecimal getGradeId() {
        return (BigDecimal) getAttributeInternal(GRADEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GradeId.
     * @param value value to set the GradeId
     */
    public void setGradeId(BigDecimal value) {
        setAttributeInternal(GRADEID, value);
    }

    /**
     * Gets the attribute value for TermId, using the alias name TermId.
     * @return the value of TermId
     */
    public BigDecimal getTermId() {
        return (BigDecimal) getAttributeInternal(TERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TermId.
     * @param value value to set the TermId
     */
    public void setTermId(BigDecimal value) {
        setAttributeInternal(TERMID, value);
    }

    /**
     * Gets the attribute value for LookupEvaluation, using the alias name LookupEvaluation.
     * @return the value of LookupEvaluation
     */
    public BigDecimal getLookupEvaluation() {
        return (BigDecimal) getAttributeInternal(LOOKUPEVALUATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupEvaluation.
     * @param value value to set the LookupEvaluation
     */
    public void setLookupEvaluation(BigDecimal value) {
        setAttributeInternal(LOOKUPEVALUATION, value);
    }

    /**
     * Gets the attribute value for LookupDTopic1, using the alias name LookupDTopic1.
     * @return the value of LookupDTopic1
     */
    public BigDecimal getLookupDTopic1() {
        return (BigDecimal) getAttributeInternal(LOOKUPDTOPIC1);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupDTopic1.
     * @param value value to set the LookupDTopic1
     */
    public void setLookupDTopic1(BigDecimal value) {
        setAttributeInternal(LOOKUPDTOPIC1, value);
    }

    /**
     * Gets the attribute value for Topic1Marks, using the alias name Topic1Marks.
     * @return the value of Topic1Marks
     */
    public BigDecimal getTopic1Marks() {
        return (BigDecimal) getAttributeInternal(TOPIC1MARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Topic1Marks.
     * @param value value to set the Topic1Marks
     */
    public void setTopic1Marks(BigDecimal value) {
        setAttributeInternal(TOPIC1MARKS, value);
    }

    /**
     * Gets the attribute value for LookupDTopic2, using the alias name LookupDTopic2.
     * @return the value of LookupDTopic2
     */
    public BigDecimal getLookupDTopic2() {
        return (BigDecimal) getAttributeInternal(LOOKUPDTOPIC2);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupDTopic2.
     * @param value value to set the LookupDTopic2
     */
    public void setLookupDTopic2(BigDecimal value) {
        setAttributeInternal(LOOKUPDTOPIC2, value);
    }

    /**
     * Gets the attribute value for Topic2Marks, using the alias name Topic2Marks.
     * @return the value of Topic2Marks
     */
    public BigDecimal getTopic2Marks() {
        return (BigDecimal) getAttributeInternal(TOPIC2MARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Topic2Marks.
     * @param value value to set the Topic2Marks
     */
    public void setTopic2Marks(BigDecimal value) {
        setAttributeInternal(TOPIC2MARKS, value);
    }

    /**
     * Gets the attribute value for EvaType, using the alias name EvaType.
     * @return the value of EvaType
     */
    public String getEvaType() {
        return (String) getAttributeInternal(EVATYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EvaType.
     * @param value value to set the EvaType
     */
    public void setEvaType(String value) {
        setAttributeInternal(EVATYPE, value);
    }

    /**
     * Gets the attribute value for TotalMarks, using the alias name TotalMarks.
     * @return the value of TotalMarks
     */
    public BigDecimal getTotalMarks() {
        return (BigDecimal) getAttributeInternal(TOTALMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalMarks.
     * @param value value to set the TotalMarks
     */
    public void setTotalMarks(BigDecimal value) {
        setAttributeInternal(TOTALMARKS, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for CompanySbuId, using the alias name CompanySbuId.
     * @return the value of CompanySbuId
     */
    public Number getCompanySbuId() {
        return (Number) getAttributeInternal(COMPANYSBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanySbuId.
     * @param value value to set the CompanySbuId
     */
    public void setCompanySbuId(Number value) {
        setAttributeInternal(COMPANYSBUID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblGradeImpl getTblGrade() {
        return (TblGradeImpl) getAttributeInternal(TBLGRADE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblGrade(TblGradeImpl value) {
        setAttributeInternal(TBLGRADE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblLookupDetailImpl getTblLookupDetail() {
        return (TblLookupDetailImpl) getAttributeInternal(TBLLOOKUPDETAIL);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblLookupDetail(TblLookupDetailImpl value) {
        setAttributeInternal(TBLLOOKUPDETAIL, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblLookupDetailDImpl getTblLookupDetailD() {
        return (TblLookupDetailDImpl) getAttributeInternal(TBLLOOKUPDETAILD);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblLookupDetailD(TblLookupDetailDImpl value) {
        setAttributeInternal(TBLLOOKUPDETAILD, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblLookupDetailDImpl getTblLookupDetailD1() {
        return (TblLookupDetailDImpl) getAttributeInternal(TBLLOOKUPDETAILD1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblLookupDetailD1(TblLookupDetailDImpl value) {
        setAttributeInternal(TBLLOOKUPDETAILD1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblTermsImpl getTblTerms() {
        return (TblTermsImpl) getAttributeInternal(TBLTERMS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblTerms(TblTermsImpl value) {
        setAttributeInternal(TBLTERMS, value);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number userId = null;
        Number cmpnyId = null;
        Number sbuId = null;
         try {
             userId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
             cmpnyId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessCmpnyID"));
             sbuId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessSBUID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {

             setGroupCompanyId(cmpnyId);
             setCompanySbuId(sbuId);

             setCreatedBy(userId);
             setUpdatedBy(userId);
             } else if(operation == DML_UPDATE) {
             
             setGroupCompanyId(cmpnyId);
             setCompanySbuId(sbuId);
             
             setUpdatedBy(userId);
         }
        super.doDML(operation, e);
    }
}

