/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2781Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_2781Record> implements org.jooq.Record2<java.lang.String, java.lang.String>, org.jooq.test.postgres.generatedclasses.tables.interfaces.IT_2781 {

	private static final long serialVersionUID = -1381235883;

	/**
	 * Setter for <code>public.t_2781.org</code>.
	 */
	public T_2781Record setOrg(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_2781.org</code>.
	 */
	@Override
	public java.lang.String getOrg() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_2781.jooq</code>.
	 */
	public T_2781Record setJooq(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_2781.jooq</code>.
	 */
	@Override
	public java.lang.String getJooq() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.T_2781.T_2781.org_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.T_2781.T_2781.jooq;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getOrg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getJooq();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2781Record
	 */
	public T_2781Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_2781.T_2781);
	}

	/**
	 * Create a detached, initialised T_2781Record
	 */
	public T_2781Record(java.lang.String org_, java.lang.String jooq) {
		super(org.jooq.test.postgres.generatedclasses.tables.T_2781.T_2781);

		setValue(0, org_);
		setValue(1, jooq);
	}
}
