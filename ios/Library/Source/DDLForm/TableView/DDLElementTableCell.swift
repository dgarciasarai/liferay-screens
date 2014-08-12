/**
* Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
import UIKit

public class DDLElementTableCell: UITableViewCell {

	public var tableView:UITableView?
	public var indexPath:NSIndexPath?
	public var formView:DDLFormView?

	public var element:DDLElement? {
		didSet {
			element?.validatedClosure = onValidated
			onChangedElement()
		}
	}

	public var isLastCell:Bool {
		get {
			var result = false

			if let indexPathValue = indexPath {
				if let rowCount = tableView?.numberOfRowsInSection(indexPathValue.section) {
					result = (indexPathValue.row == rowCount - 1)
				}
			}

			return result
		}
	}

	internal func onChangedElement() {
	}

	internal func onValidated(valid:Bool) {
	}

}
