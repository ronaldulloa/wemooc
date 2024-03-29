/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the Module service. Represents a row in the &quot;Lms_Module&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.lms.model.impl.ModuleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.lms.model.impl.ModuleImpl}.
 * </p>
 *
 * @author TLS
 * @see Module
 * @see com.liferay.lms.model.impl.ModuleImpl
 * @see com.liferay.lms.model.impl.ModuleModelImpl
 * @generated
 */
public interface ModuleModel extends BaseModel<Module>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a module model instance should use the {@link Module} interface instead.
	 */

	/**
	 * Returns the primary key of this module.
	 *
	 * @return the primary key of this module
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this module.
	 *
	 * @param primaryKey the primary key of this module
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this module.
	 *
	 * @return the uuid of this module
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this module.
	 *
	 * @param uuid the uuid of this module
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the module ID of this module.
	 *
	 * @return the module ID of this module
	 */
	public long getModuleId();

	/**
	 * Sets the module ID of this module.
	 *
	 * @param moduleId the module ID of this module
	 */
	public void setModuleId(long moduleId);

	/**
	 * Returns the company ID of this module.
	 *
	 * @return the company ID of this module
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this module.
	 *
	 * @param companyId the company ID of this module
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this module.
	 *
	 * @return the group ID of this module
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this module.
	 *
	 * @param groupId the group ID of this module
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this module.
	 *
	 * @return the user ID of this module
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this module.
	 *
	 * @param userId the user ID of this module
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this module.
	 *
	 * @return the user uuid of this module
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this module.
	 *
	 * @param userUuid the user uuid of this module
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this module.
	 *
	 * @return the user name of this module
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this module.
	 *
	 * @param userName the user name of this module
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this module.
	 *
	 * @return the create date of this module
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this module.
	 *
	 * @param createDate the create date of this module
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this module.
	 *
	 * @return the modified date of this module
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this module.
	 *
	 * @param modifiedDate the modified date of this module
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this module.
	 *
	 * @return the title of this module
	 */
	public String getTitle();

	/**
	 * Returns the localized title of this module in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this module
	 */
	@AutoEscape
	public String getTitle(Locale locale);

	/**
	 * Returns the localized title of this module in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this module. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Returns the localized title of this module in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this module
	 */
	@AutoEscape
	public String getTitle(String languageId);

	/**
	 * Returns the localized title of this module in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this module
	 */
	@AutoEscape
	public String getTitle(String languageId, boolean useDefault);

	@AutoEscape
	public String getTitleCurrentLanguageId();

	@AutoEscape
	public String getTitleCurrentValue();

	/**
	 * Returns a map of the locales and localized titles of this module.
	 *
	 * @return the locales and localized titles of this module
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this module.
	 *
	 * @param title the title of this module
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this module in the language.
	 *
	 * @param title the localized title of this module
	 * @param locale the locale of the language
	 */
	public void setTitle(String title, Locale locale);

	/**
	 * Sets the localized title of this module in the language, and sets the default locale.
	 *
	 * @param title the localized title of this module
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setTitle(String title, Locale locale, Locale defaultLocale);

	public void setTitleCurrentLanguageId(String languageId);

	/**
	 * Sets the localized titles of this module from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this module
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	/**
	 * Sets the localized titles of this module from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this module
	 * @param defaultLocale the default locale
	 */
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Returns the description of this module.
	 *
	 * @return the description of this module
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this module in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this module
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this module in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this module. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this module in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this module
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this module in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this module
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this module.
	 *
	 * @return the locales and localized descriptions of this module
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this module.
	 *
	 * @param description the description of this module
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this module in the language.
	 *
	 * @param description the localized description of this module
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this module in the language, and sets the default locale.
	 *
	 * @param description the localized description of this module
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this module from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this module
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this module from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this module
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Returns the ordern of this module.
	 *
	 * @return the ordern of this module
	 */
	public long getOrdern();

	/**
	 * Sets the ordern of this module.
	 *
	 * @param ordern the ordern of this module
	 */
	public void setOrdern(long ordern);

	/**
	 * Returns the start date of this module.
	 *
	 * @return the start date of this module
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this module.
	 *
	 * @param startDate the start date of this module
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the end date of this module.
	 *
	 * @return the end date of this module
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this module.
	 *
	 * @param endDate the end date of this module
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the icon of this module.
	 *
	 * @return the icon of this module
	 */
	public long getIcon();

	/**
	 * Sets the icon of this module.
	 *
	 * @param icon the icon of this module
	 */
	public void setIcon(long icon);

	/**
	 * Returns the precedence of this module.
	 *
	 * @return the precedence of this module
	 */
	public long getPrecedence();

	/**
	 * Sets the precedence of this module.
	 *
	 * @param precedence the precedence of this module
	 */
	public void setPrecedence(long precedence);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	public Object clone();

	public int compareTo(Module module);

	public int hashCode();

	public CacheModel<Module> toCacheModel();

	public Module toEscapedModel();

	public String toString();

	public String toXmlString();
}