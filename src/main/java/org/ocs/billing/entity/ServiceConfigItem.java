package org.ocs.billing.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="service_config_item")
@NamedQuery(name="ServiceConfigItem.findAll", query="SELECT s FROM ServiceConfigItem s")
public class ServiceConfigItem implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="service_config_item_id", unique=true, nullable=false, precision=6)
	private long serviceConfigItemId;

	@Column(length=255)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="param_code", nullable=false, length=60)
	private String paramCode;

	@Column(name="param_name", nullable=false, length=255)
	private String paramName;

	@Column(name="param_value", length=4000)
	private String paramValue;

	@Column(name="service_module", nullable=false, length=30)
	private String serviceModule;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date", nullable=false)
	private Date updateDate;

	@Column(length=1)
	private String visiable;

	public ServiceConfigItem() {
	}
}
