import React from 'react'

class Student extends React.Component {
    constructor(props) {
        super(props);
        this.state = {editShow: false};
        this.deleteStudent = this.deleteStudent.bind(this);      
    }

    deleteStudent() {
        this.props.deleteStudent(this.props.student.id);
    } 

    render() {
        return (
          <tr>
            <td>{this.props.student.id}</td>
            <td>{this.props.student.firstname}</td>
            <td>{this.props.student.lastname}</td>
            <td>{this.props.student.email}</td>
            <td>               
                <button className="btn btn-danger btn-xs" onClick={this.deleteStudent}>Delete</button>
            </td>
          </tr>
        );
    } 
}
export default Student;