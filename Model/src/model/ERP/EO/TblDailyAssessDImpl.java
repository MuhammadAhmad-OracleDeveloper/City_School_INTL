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
// ---    Sat Dec 12 11:18:26 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblDailyAssessDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        DailyAssessMId,
        DailyAssessGradesId,
        StdRegId,
        TeacherRemarks,
        PrincipalRemarks,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblDailyAssessGrades,
        TblDailyAssessM;
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
    public static final int DAILYASSESSMID = AttributesEnum.DailyAssessMId.index();
    public static final int DAILYASSESSGRADESID = AttributesEnum.DailyAssessGradesId.index();
    public static final int STDREGID = AttributesEnum.StdRegId.index();
    public static final int TEACHERREMARKS = AttributesEnum.TeacherRemarks.index();
    public static final int PRINCIPALREMARKS = AttributesEnum.PrincipalRemarks.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLDAILYASSESSGRADES = AttributesEnum.TblDailyAssessGrades.index();
    public static final int TBLDAILYASSESSM = AttributesEnum.TblDailyAssessM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblDailyAssessDImpl() {
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
     * Gets the attribute value for DailyAssessMId, using the alias name DailyAssessMId.
     * @return the value of DailyAssessMId
     */
    public BigDecimal getDailyAssessMId() {
        return (BigDecimal) getAttributeInternal(DAILYASSESSMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DailyAssessMId.
     * @param value value to set the DailyAssessMId
     */
    public void setDailyAssessMId(BigDecimal value) {
        setAttributeInternal(DAILYASSESSMID, value);
    }

    /**
     * Gets the attribute value for DailyAssessGradesId, using the alias name DailyAssessGradesId.
     * @return the value of DailyAssessGradesId
     */
    public BigDecimal getDailyAssessGradesId() {
        return (BigDecimal) getAttributeInternal(DAILYASSESSGRADESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DailyAssessGradesId.
     * @param value value to set the DailyAssessGradesId
     */
    public void setDailyAssessGradesId(BigDecimal value) {
        setAttributeInternal(DAILYASSESSGRADESID, value);
    }

    /**
     * Gets the attribute value for StdRegId, using the alias name StdRegId.
     * @return the value of StdRegId
     */
    public BigDecimal getStdRegId() {
        return (BigDecimal) getAttributeInternal(STDREGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StdRegId.
     * @param value value to set the StdRegId
     */
    public void setStdRegId(BigDecimal value) {
        setAttributeInternal(STDREGID, value);
    }

    /**
     * Gets the attribute value for TeacherRemarks, using the alias name TeacherRemarks.
     * @return the value of TeacherRemarks
     */
    public String getTeacherRemarks() {
        return (String) getAttributeInternal(TEACHERREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TeacherRemarks.
     * @param value value to set the TeacherRemarks
     */
    public void setTeacherRemarks(String value) {
        setAttributeInternal(TEACHERREMARKS, value);
    }

    /**
     * Gets the attribute value for PrincipalRemarks, using the alias name PrincipalRemarks.
     * @return the value of PrincipalRemarks
     */
    public String getPrincipalRemarks() {
        return (String) getAttributeInternal(PRINCIPALREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrincipalRemarks.
     * @param value value to set the PrincipalRemarks
     */
    public void setPrincipalRemarks(String value) {
        setAttributeInternal(PRINCIPALREMARKS, value);
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
     * @return the associated entity TblDailyAssessGradesImpl.
     */
    public TblDailyAssessGradesImpl getTblDailyAssessGrades() {
        return (TblDailyAssessGradesImpl) getAttributeInternal(TBLDAILYASSESSGRADES);
    }

    /**
     * Sets <code>value</code> as the associated entity TblDailyAssessGradesImpl.
     */
    public void setTblDailyAssessGrades(TblDailyAssessGradesImpl value) {
        setAttributeInternal(TBLDAILYASSESSGRADES, value);
    }

    /**
     * @return the associated entity TblDailyAssessMImpl.
     */
    public TblDailyAssessMImpl getTblDailyAssessM() {
        return (TblDailyAssessMImpl) getAttributeInternal(TBLDAILYASSESSM);
    }

    /**
     * Sets <code>value</code> as the associated entity TblDailyAssessMImpl.
     */
    public void setTblDailyAssessM(TblDailyAssessMImpl value) {
        setAttributeInternal(TBLDAILYASSESSM, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblDailyAssessD");
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
        Number loginId = null;
                       try {
                           loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
                       } catch(Exception ex) {
                           ex.printStackTrace();
                       }
                       
                       if (operation == DML_INSERT) {
                           setCreatedBy(loginId);
                           setUpdatedBy(loginId);
                           } else if(operation == DML_UPDATE) {
                           setUpdatedBy(loginId);
                       }
        super.doDML(operation, e);
    }
}

