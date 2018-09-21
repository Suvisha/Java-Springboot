import React from 'react'

class Student extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.student.firstName}</td>
				<td>{this.props.student.lastName}</td>
				<td>{this.props.student.Class}</td>
                <td>{this.props.student.Division}</td>
				<td>{this.props.student.AddressLine1}</td>
				<td>{this.props.student.AddressLine2}</td>
                <td>{this.props.student.pincode}</td>
			</tr>
		)
	}
}
export default Student;