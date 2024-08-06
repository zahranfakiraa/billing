package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="contact_channel")
@NamedQuery(name="ContactChannel.findAll", query="SELECT c FROM ContactChannel c")
public class ContactChannel implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="contact_channel_id", unique=true, nullable=false, precision=3)
	private long contactChannelId;

	@Column(name="channel_type", nullable=false, precision=3)
	private BigDecimal channelType;

	@Column(length=120)
	private String comments;

	@Column(name="contact_channel_name", nullable=false, length=60)
	private String contactChannelName;

	public ContactChannel() {
	}
}
