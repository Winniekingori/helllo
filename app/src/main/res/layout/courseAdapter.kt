package layout

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.helllo.courseactivity1

 val View.course_id: Any
    get() {}

class courseAdapter {
    class ViewHolder {

    }
} RecyclerView.Adapter<RecyclerView.ViewHolder>() {

     var items: List<courseactivity1>=ArrayList()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): courseAdapter.ViewHolder {

        }

        override fun getItemCount(): Int {
            return items.size
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        }

        class CourseViewHolder constructor(
            itemView: View
        ) : RecyclerView.ViewHolder(itemView) {
            val courseName = itemView.course_name
            val course_id = itemView.course_id
            val course_code = itemView.course_code
            val course_instructor = itemView.course_instructor
            val course_description = itemView.course_description

            fun bind(course:CourseAdapter){
                courseName.setText(course.courseName)
                course_id.setText(course.courseId)
                course_code.setText(course.courseCode)
                course_description.setText(course.description)
                course_instructor.setText(course.instructor)
}