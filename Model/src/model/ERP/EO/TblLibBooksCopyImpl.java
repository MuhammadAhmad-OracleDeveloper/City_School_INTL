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
// ---    Wed Apr 01 13:19:21 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblLibBooksCopyImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        LibBooksId,
        UserType,
        CopyStatus,
        CopyBarcode,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        BookcopyType,
        TblLibBooks;
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
    public static final int LIBBOOKSID = AttributesEnum.LibBooksId.index();
    public static final int USERTYPE = AttributesEnum.UserType.index();
    public static final int COPYSTATUS = AttributesEnum.CopyStatus.index();
    public static final int COPYBARCODE = AttributesEnum.CopyBarcode.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int BOOKCOPYTYPE = AttributesEnum.BookcopyType.index();
    public static final int TBLLIBBOOKS = AttributesEnum.TblLibBooks.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblLibBooksCopyImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblLibBooksCopy");
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
     * Gets the attribute value for LibBooksId, using the alias name LibBooksId.
     * @return the value of LibBooksId
     */
    public BigDecimal getLibBooksId() {
        return (BigDecimal) getAttributeInternal(LIBBOOKSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LibBooksId.
     * @param value value to set the LibBooksId
     */
    public void setLibBooksId(BigDecimal value) {
        setAttributeInternal(LIBBOOKSID, value);
    }

    /**
     * Gets the attribute value for UserType, using the alias name UserType.
     * @return the value of UserType
     */
    public String getUserType() {
        return (String) getAttributeInternal(USERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserType.
     * @param value value to set the UserType
     */
    public void setUserType(String value) {
        setAttributeInternal(USERTYPE, value);
    }

    /**
     * Gets the attribute value for CopyStatus, using the alias name CopyStatus.
     * @return the value of CopyStatus
     */
    public String getCopyStatus() {
        return (String) getAttributeInternal(COPYSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for CopyStatus.
     * @param value value to set the CopyStatus
     */
    public void setCopyStatus(String value) {
        setAttributeInternal(COPYSTATUS, value);
    }

    /**
     * Gets the attribute value for CopyBarcode, using the alias name CopyBarcode.
     * @return the value of CopyBarcode
     */
    public String getCopyBarcode() {
        return (String) getAttributeInternal(COPYBARCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CopyBarcode.
     * @param value value to set the CopyBarcode
     */
    public void setCopyBarcode(String value) {
        setAttributeInternal(COPYBARCODE, value);
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
     * Gets the attribute value for BookcopyType, using the alias name BookcopyType.
     * @return the value of BookcopyType
     */
    public String getBookcopyType() {
        return (String) getAttributeInternal(BOOKCOPYTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookcopyType.
     * @param value value to set the BookcopyType
     */
    public void setBookcopyType(String value) {
        setAttributeInternal(BOOKCOPYTYPE, value);
    }

    /**
     * @return the associated entity TblLibBooksImpl.
     */
    public TblLibBooksImpl getTblLibBooks() {
        return (TblLibBooksImpl) getAttributeInternal(TBLLIBBOOKS);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLibBooksImpl.
     */
    public void setTblLibBooks(TblLibBooksImpl value) {
        setAttributeInternal(TBLLIBBOOKS, value);
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
        Number loginId = null;
         try {
             loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
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

