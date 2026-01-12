package com.code81.tmo.liferay.rest.client.dto.v1_0;

import com.code81.tmo.liferay.rest.client.function.UnsafeSupplier;
import com.code81.tmo.liferay.rest.client.serdes.v1_0.ServiceSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
public class Service implements Cloneable, Serializable {

	public static Service toDTO(String json) {
		return ServiceSerDes.toDTO(json);
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public void setBrief(
		UnsafeSupplier<String, Exception> briefUnsafeSupplier) {

		try {
			brief = briefUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String brief;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCode(UnsafeSupplier<String, Exception> codeUnsafeSupplier) {
		try {
			code = codeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String code;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDate(UnsafeSupplier<String, Exception> dateUnsafeSupplier) {
		try {
			date = dateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String date;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String description;

	public String[] getDocuments() {
		return documents;
	}

	public void setDocuments(String[] documents) {
		this.documents = documents;
	}

	public void setDocuments(
		UnsafeSupplier<String[], Exception> documentsUnsafeSupplier) {

		try {
			documents = documentsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String[] documents;

	public Integer getExpecterResponseTime() {
		return expecterResponseTime;
	}

	public void setExpecterResponseTime(Integer expecterResponseTime) {
		this.expecterResponseTime = expecterResponseTime;
	}

	public void setExpecterResponseTime(
		UnsafeSupplier<Integer, Exception> expecterResponseTimeUnsafeSupplier) {

		try {
			expecterResponseTime = expecterResponseTimeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer expecterResponseTime;

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	public void setExternalUrl(
		UnsafeSupplier<String, Exception> externalUrlUnsafeSupplier) {

		try {
			externalUrl = externalUrlUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String externalUrl;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setImageUrl(
		UnsafeSupplier<String, Exception> imageUrlUnsafeSupplier) {

		try {
			imageUrl = imageUrlUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String imageUrl;

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public void setOutcome(
		UnsafeSupplier<String, Exception> outcomeUnsafeSupplier) {

		try {
			outcome = outcomeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String outcome;

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public void setProcedure(
		UnsafeSupplier<String, Exception> procedureUnsafeSupplier) {

		try {
			procedure = procedureUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String procedure;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setSource(
		UnsafeSupplier<String, Exception> sourceUnsafeSupplier) {

		try {
			source = sourceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String source;

	public String getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public void setTermsAndConditions(
		UnsafeSupplier<String, Exception> termsAndConditionsUnsafeSupplier) {

		try {
			termsAndConditions = termsAndConditionsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String termsAndConditions;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String title;

	@Override
	public Service clone() throws CloneNotSupportedException {
		return (Service)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Service)) {
			return false;
		}

		Service service = (Service)object;

		return Objects.equals(toString(), service.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ServiceSerDes.toJSON(this);
	}

}