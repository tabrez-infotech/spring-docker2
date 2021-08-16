/**
 * Copyright (C) 2016
 * File          : Mailbox.java
 * Author        : Tabrez Khan
 * Company       : MIND
 * Date Created  : Feb 03, 2016 Feb 02, 2016
 * Description   : Bean class for Mailbox.
 **/
package co.in.docker;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Mailbox.
 */
public class Mailbox implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2460180947727026028L;

	/** The mail id. */
	private Long mailId;

	/** The reference id. */
	private String referenceId;

	/** The message id. */
	private Long messageId;

	/** The mail from. */
	private String mailFrom;

	/** The mail to. */
	private String mailTo;

	/** The mail cc. */
	private String mailCc;

	/** The mail bcc. */
	private String mailBcc;

	/** The mail subject. */
	private String mailSubject;

	/** The mail body. */
	private String mailBody;

	/** The trials. */
	private Integer trials;

	/** The error success. */
	private String errorSuccess;

	/** The source page. */
	private String sourcePage;

	/** The has attachment. */
	private char hasAttachment;

	/** The attached file. */
	private List<String> attachedFile;

	private String ipAddress;

	/** The created date. */
	private Date createdDate;

	/**
	 * Default constructor.
	 */
	public Mailbox() {
	}

	/**
	 * Return mail id.
	 *
	 * @return Long
	 */
	public Long getMailId() {
		return mailId;
	}

	/**
	 * Set mail id.
	 *
	 * @param mailId Long
	 */
	public void setMailId(Long mailId) {
		this.mailId = mailId;
	}

	/**
	 * Return referenceId.
	 *
	 * @return String
	 */
	public String getReferenceId() {
		return referenceId;
	}

	/**
	 * Set referenceId.
	 *
	 * @param referenceId String
	 */
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	/**
	 * Return mailFrom.
	 *
	 * @return String
	 */
	public String getMailFrom() {
		return mailFrom;
	}

	/**
	 * Set mailFrom.
	 *
	 * @param mailFrom String
	 */
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	/**
	 * Return mailTo.
	 *
	 * @return
	 */
	public String getMailTo() {
		return mailTo;
	}

	/**
	 * Set mailTo.
	 *
	 * @param mailTo String
	 */
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	/**
	 * Return mailCc.
	 *
	 * @return String
	 */
	public String getMailCc() {
		return mailCc;
	}

	/**
	 * Set mailCc.
	 *
	 * @param mailCc String
	 */
	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
	}

	/**
	 * Return mailBcc.
	 *
	 * @return String
	 */
	public String getMailBcc() {
		return mailBcc;
	}

	/**
	 * Set mailBcc.
	 *
	 * @param mailBcc String
	 */
	public void setMailBcc(String mailBcc) {
		this.mailBcc = mailBcc;
	}

	/**
	 * Return mailSubject.
	 *
	 * @return String
	 */
	public String getMailSubject() {
		return mailSubject;
	}

	/**
	 * Set mailSubject.
	 *
	 * @param mailSubject String
	 */
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	/**
	 * Return mailBody.
	 *
	 * @return String
	 */
	public String getMailBody() {
		return mailBody;
	}

	/**
	 * Set mailBody.
	 *
	 * @param mailBody String
	 */
	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

	/**
	 * Return trials.
	 *
	 * @return Integer
	 */
	public Integer getTrials() {
		return trials;
	}

	/**
	 * Set trials.
	 *
	 * @param trials Integer
	 */
	public void setTrials(Integer trials) {
		this.trials = trials;
	}

	/**
	 * Return errorSuccess.
	 *
	 * @return String
	 */
	public String getErrorSuccess() {
		return errorSuccess;
	}

	/**
	 * Set errorSuccess.
	 *
	 * @param errorSuccess String
	 */
	public void setErrorSuccess(String errorSuccess) {
		this.errorSuccess = errorSuccess;
	}

	/**
	 * Return sourcePage.
	 *
	 * @return String
	 */
	public String getSourcePage() {
		return sourcePage;
	}

	/**
	 * Set sourcePage.
	 *
	 * @param sourcePage String
	 */
	public void setSourcePage(String sourcePage) {
		this.sourcePage = sourcePage;
	}

	/**
	 * Return messageId.
	 *
	 * @return Long
	 */
	public Long getMessageId() {
		return messageId;
	}

	/**
	 * Set messageId.
	 *
	 * @param messageId Long
	 */
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	/**
	 * @return the hasAttachment
	 */
	public char getHasAttachment() {
		return hasAttachment;
	}

	/**
	 * @param c the hasAttachment to set
	 */
	public void setHasAttachment(char c) {
		hasAttachment = c;
	}

	/**
	 * @return the attachedFile
	 */
	public List<String> getAttachedFile() {
		return attachedFile;
	}

	/**
	 * @param attachedFile the attachedFile to set
	 */
	public void setAttachedFile(List<String> attachedFile) {
		this.attachedFile = attachedFile;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getIpAddress() {
		return ipAddress;
	}
}
