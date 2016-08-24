package com.liliang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TFuncdict entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_funcdict", catalog = "fb_database")
public class TFuncdict implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer parentId;
	private String resKey;
	private String type;
	private String resUrl;
	private Integer level;
	private String icon;
	private Integer ishide;
	private String description;

	// Constructors

	/** default constructor */
	public TFuncdict() {
	}

	/** full constructor */
	public TFuncdict(String name, Integer parentId, String resKey, String type,
			String resUrl, Integer level, String icon, Integer ishide,
			String description) {
		this.name = name;
		this.parentId = parentId;
		this.resKey = resKey;
		this.type = type;
		this.resUrl = resUrl;
		this.level = level;
		this.icon = icon;
		this.ishide = ishide;
		this.description = description;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "parentId")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "resKey", length = 50)
	public String getResKey() {
		return this.resKey;
	}

	public void setResKey(String resKey) {
		this.resKey = resKey;
	}

	@Column(name = "type", length = 40)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "resUrl", length = 200)
	public String getResUrl() {
		return this.resUrl;
	}

	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}

	@Column(name = "level")
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Column(name = "icon", length = 100)
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "ishide")
	public Integer getIshide() {
		return this.ishide;
	}

	public void setIshide(Integer ishide) {
		this.ishide = ishide;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}