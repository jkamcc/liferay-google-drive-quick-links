/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.portlet.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rivetlogic.portlet.model.DriveLinks;
import com.rivetlogic.portlet.model.DriveLinksModel;
import com.rivetlogic.portlet.model.DriveLinksSoap;
import com.rivetlogic.portlet.service.persistence.DriveLinksPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DriveLinks service. Represents a row in the &quot;rivetlogic_driveQL_DriveLinks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rivetlogic.portlet.model.DriveLinksModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DriveLinksImpl}.
 * </p>
 *
 * @author charlesrodriguez
 * @see DriveLinksImpl
 * @see com.rivetlogic.portlet.model.DriveLinks
 * @see com.rivetlogic.portlet.model.DriveLinksModel
 * @generated
 */
@JSON(strict = true)
public class DriveLinksModelImpl extends BaseModelImpl<DriveLinks>
	implements DriveLinksModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a drive links model instance should use the {@link com.rivetlogic.portlet.model.DriveLinks} interface instead.
	 */
	public static final String TABLE_NAME = "rivetlogic_driveQL_DriveLinks";
	public static final Object[][] TABLE_COLUMNS = {
			{ "USER_ID", Types.VARCHAR },
			{ "DOCUMENT_ID", Types.VARCHAR },
			{ "NAME", Types.VARCHAR },
			{ "URL", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table rivetlogic_driveQL_DriveLinks (USER_ID VARCHAR(75) not null,DOCUMENT_ID VARCHAR(75) not null,NAME VARCHAR(200) null,URL VARCHAR(150) null,primary key (USER_ID, DOCUMENT_ID))";
	public static final String TABLE_SQL_DROP = "drop table rivetlogic_driveQL_DriveLinks";
	public static final String ORDER_BY_JPQL = " ORDER BY driveLinks.id.USER_ID ASC, driveLinks.id.DOCUMENT_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rivetlogic_driveQL_DriveLinks.USER_ID ASC, rivetlogic_driveQL_DriveLinks.DOCUMENT_ID ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rivetlogic.portlet.model.DriveLinks"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rivetlogic.portlet.model.DriveLinks"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rivetlogic.portlet.model.DriveLinks"),
			true);
	public static long USER_ID_COLUMN_BITMASK = 1L;
	public static long DOCUMENT_ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DriveLinks toModel(DriveLinksSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DriveLinks model = new DriveLinksImpl();

		model.setUSER_ID(soapModel.getUSER_ID());
		model.setDOCUMENT_ID(soapModel.getDOCUMENT_ID());
		model.setNAME(soapModel.getNAME());
		model.setURL(soapModel.getURL());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DriveLinks> toModels(DriveLinksSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DriveLinks> models = new ArrayList<DriveLinks>(soapModels.length);

		for (DriveLinksSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rivetlogic.portlet.model.DriveLinks"));

	public DriveLinksModelImpl() {
	}

	@Override
	public DriveLinksPK getPrimaryKey() {
		return new DriveLinksPK(_USER_ID, _DOCUMENT_ID);
	}

	@Override
	public void setPrimaryKey(DriveLinksPK primaryKey) {
		setUSER_ID(primaryKey.USER_ID);
		setDOCUMENT_ID(primaryKey.DOCUMENT_ID);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new DriveLinksPK(_USER_ID, _DOCUMENT_ID);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((DriveLinksPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return DriveLinks.class;
	}

	@Override
	public String getModelClassName() {
		return DriveLinks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("USER_ID", getUSER_ID());
		attributes.put("DOCUMENT_ID", getDOCUMENT_ID());
		attributes.put("NAME", getNAME());
		attributes.put("URL", getURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String USER_ID = (String)attributes.get("USER_ID");

		if (USER_ID != null) {
			setUSER_ID(USER_ID);
		}

		String DOCUMENT_ID = (String)attributes.get("DOCUMENT_ID");

		if (DOCUMENT_ID != null) {
			setDOCUMENT_ID(DOCUMENT_ID);
		}

		String NAME = (String)attributes.get("NAME");

		if (NAME != null) {
			setNAME(NAME);
		}

		String URL = (String)attributes.get("URL");

		if (URL != null) {
			setURL(URL);
		}
	}

	@JSON
	@Override
	public String getUSER_ID() {
		if (_USER_ID == null) {
			return StringPool.BLANK;
		}
		else {
			return _USER_ID;
		}
	}

	@Override
	public void setUSER_ID(String USER_ID) {
		_columnBitmask |= USER_ID_COLUMN_BITMASK;

		if (_originalUSER_ID == null) {
			_originalUSER_ID = _USER_ID;
		}

		_USER_ID = USER_ID;
	}

	public String getOriginalUSER_ID() {
		return GetterUtil.getString(_originalUSER_ID);
	}

	@JSON
	@Override
	public String getDOCUMENT_ID() {
		if (_DOCUMENT_ID == null) {
			return StringPool.BLANK;
		}
		else {
			return _DOCUMENT_ID;
		}
	}

	@Override
	public void setDOCUMENT_ID(String DOCUMENT_ID) {
		_DOCUMENT_ID = DOCUMENT_ID;
	}

	@JSON
	@Override
	public String getNAME() {
		if (_NAME == null) {
			return StringPool.BLANK;
		}
		else {
			return _NAME;
		}
	}

	@Override
	public void setNAME(String NAME) {
		_NAME = NAME;
	}

	@JSON
	@Override
	public String getURL() {
		if (_URL == null) {
			return StringPool.BLANK;
		}
		else {
			return _URL;
		}
	}

	@Override
	public void setURL(String URL) {
		_URL = URL;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DriveLinks toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DriveLinks)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DriveLinksImpl driveLinksImpl = new DriveLinksImpl();

		driveLinksImpl.setUSER_ID(getUSER_ID());
		driveLinksImpl.setDOCUMENT_ID(getDOCUMENT_ID());
		driveLinksImpl.setNAME(getNAME());
		driveLinksImpl.setURL(getURL());

		driveLinksImpl.resetOriginalValues();

		return driveLinksImpl;
	}

	@Override
	public int compareTo(DriveLinks driveLinks) {
		DriveLinksPK primaryKey = driveLinks.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DriveLinks)) {
			return false;
		}

		DriveLinks driveLinks = (DriveLinks)obj;

		DriveLinksPK primaryKey = driveLinks.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		DriveLinksModelImpl driveLinksModelImpl = this;

		driveLinksModelImpl._originalUSER_ID = driveLinksModelImpl._USER_ID;

		driveLinksModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DriveLinks> toCacheModel() {
		DriveLinksCacheModel driveLinksCacheModel = new DriveLinksCacheModel();

		driveLinksCacheModel.USER_ID = getUSER_ID();

		String USER_ID = driveLinksCacheModel.USER_ID;

		if ((USER_ID != null) && (USER_ID.length() == 0)) {
			driveLinksCacheModel.USER_ID = null;
		}

		driveLinksCacheModel.DOCUMENT_ID = getDOCUMENT_ID();

		String DOCUMENT_ID = driveLinksCacheModel.DOCUMENT_ID;

		if ((DOCUMENT_ID != null) && (DOCUMENT_ID.length() == 0)) {
			driveLinksCacheModel.DOCUMENT_ID = null;
		}

		driveLinksCacheModel.NAME = getNAME();

		String NAME = driveLinksCacheModel.NAME;

		if ((NAME != null) && (NAME.length() == 0)) {
			driveLinksCacheModel.NAME = null;
		}

		driveLinksCacheModel.URL = getURL();

		String URL = driveLinksCacheModel.URL;

		if ((URL != null) && (URL.length() == 0)) {
			driveLinksCacheModel.URL = null;
		}

		return driveLinksCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{USER_ID=");
		sb.append(getUSER_ID());
		sb.append(", DOCUMENT_ID=");
		sb.append(getDOCUMENT_ID());
		sb.append(", NAME=");
		sb.append(getNAME());
		sb.append(", URL=");
		sb.append(getURL());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.portlet.model.DriveLinks");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>USER_ID</column-name><column-value><![CDATA[");
		sb.append(getUSER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DOCUMENT_ID</column-name><column-value><![CDATA[");
		sb.append(getDOCUMENT_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NAME</column-name><column-value><![CDATA[");
		sb.append(getNAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>URL</column-name><column-value><![CDATA[");
		sb.append(getURL());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DriveLinks.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DriveLinks.class
		};
	private String _USER_ID;
	private String _originalUSER_ID;
	private String _DOCUMENT_ID;
	private String _NAME;
	private String _URL;
	private long _columnBitmask;
	private DriveLinks _escapedModel;
}